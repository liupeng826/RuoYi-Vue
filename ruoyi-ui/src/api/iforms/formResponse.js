import request from '@/utils/request'

// 查询表单反馈列表
export function listFormResponse(query) {
  return request({
    url: '/iforms/formResponse/list',
    method: 'get',
    params: query
  })
}

// 查询表单反馈详细
export function getFormResponse(id) {
  return request({
    url: '/iforms/formResponse/' + id,
    method: 'get'
  })
}

// 新增表单反馈
export function addFormResponse(data) {
  return request({
    url: '/iforms/formResponse',
    method: 'post',
    data: data
  })
}

// 修改表单反馈
export function updateFormResponse(data) {
  return request({
    url: '/iforms/formResponse',
    method: 'put',
    data: data
  })
}

// 删除表单反馈
export function delFormResponse(id) {
  return request({
    url: '/iforms/formResponse/' + id,
    method: 'delete'
  })
}

// 导出表单反馈
export function exportFormResponse(query) {
  return request({
    url: '/iforms/formResponse/export',
    method: 'get',
    params: query
  })
}