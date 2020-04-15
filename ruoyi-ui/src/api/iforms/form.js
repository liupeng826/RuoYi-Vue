import request from '@/utils/request'

// 查询表单列表
export function listForm(query) {
  return request({
    url: '/iforms/form/list',
    method: 'get',
    params: query
  })
}

// 查询表单详细
export function getForm(id) {
  return request({
    url: '/iforms/form/' + id,
    method: 'get'
  })
}

// 新增表单
export function addForm(data) {
  return request({
    url: '/iforms/form',
    method: 'post',
    data: data
  })
}

// 修改表单
export function updateForm(data) {
  return request({
    url: '/iforms/form',
    method: 'put',
    data: data
  })
}

// 删除表单
export function delForm(id) {
  return request({
    url: '/iforms/form/' + id,
    method: 'delete'
  })
}

// 导出表单
export function exportForm(query) {
  return request({
    url: '/iforms/form/export',
    method: 'get',
    params: query
  })
}